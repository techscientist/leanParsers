import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public String end_time;
	public CreatorModel _creator;
	public String name;
	public String topic;
	public String privacy;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String location_name;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public String logo;
	public String description;
	public String state;
	public String code_of_conduct;
	public String organizer_name;
	public String timezone;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String type;

	public RootModel(String background_image, int id, String end_time, CreatorModel creator, String name, String topic, String privacy, VersionModel version, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String location_name, String organizer_description, String schedule_published_on, String email, String logo, String description, String state, String code_of_conduct, String organizer_name, String timezone, String start_time, Call_for_papersModel call_for_papers, String type) {

		this.background_image = background_image;
		this.id = id;
		this.end_time = end_time;
		this._creator = creator;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this._version = version;
		this.social_links = social_links;
		this._copyright = copyright;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.logo = logo;
		this.description = description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.type = type;

	}

}