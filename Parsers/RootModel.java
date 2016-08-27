import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String email;
	public String topic;
	public String logo;
	public String timezone;
	public VersionModel _version;
	public String description;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CopyrightModel _copyright;
	public String end_time;
	public String background_image;
	public String location_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public String code_of_conduct;
	public String state;
	public String type;

	public RootModel(String privacy, String email, String topic, String logo, String timezone, VersionModel version, String description, String schedule_published_on, ArrayList<Social_linksModel> social_links, String start_time, CopyrightModel copyright, String end_time, String background_image, String location_name, int id, Call_for_papersModel call_for_papers, String organizer_name, String organizer_description, CreatorModel creator, String name, String code_of_conduct, String state, String type) {

		this.privacy = privacy;
		this.email = email;
		this.topic = topic;
		this.logo = logo;
		this.timezone = timezone;
		this._version = version;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.start_time = start_time;
		this._copyright = copyright;
		this.end_time = end_time;
		this.background_image = background_image;
		this.location_name = location_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.type = type;

	}

}