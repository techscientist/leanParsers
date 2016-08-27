import java.util.ArrayList;

class RootModel {

	public String email;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String location_name;
	public int id;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String end_time;
	public String organizer_name;
	public String privacy;
	public String logo;
	public String start_time;
	public String schedule_published_on;
	public String name;
	public String organizer_description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String type;

	public RootModel(String email, CreatorModel creator, String background_image, String timezone, String location_name, int id, String description, Call_for_papersModel call_for_papers, String state, String end_time, String organizer_name, String privacy, String logo, String start_time, String schedule_published_on, String name, String organizer_description, String code_of_conduct, CopyrightModel copyright, String topic, VersionModel version, ArrayList<Social_linksModel> social_links, String type) {

		this.email = email;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.location_name = location_name;
		this.id = id;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this._version = version;
		this.social_links = social_links;
		this.type = type;

	}

}