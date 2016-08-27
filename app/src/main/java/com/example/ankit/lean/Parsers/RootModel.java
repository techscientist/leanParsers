import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String name;
	public String schedule_published_on;
	public String organizer_name;
	public String description;
	public String state;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public String logo;
	public String timezone;
	public String email;
	public String topic;
	public String background_image;
	public CopyrightModel _copyright;
	public String end_time;
	public int id;
	public CreatorModel _creator;

	public RootModel(String code_of_conduct, String type, Call_for_papersModel call_for_papers, String organizer_description, String name, String schedule_published_on, String organizer_name, String description, String state, String start_time, ArrayList<Social_linksModel> social_links, VersionModel version, String privacy, String location_name, String logo, String timezone, String email, String topic, String background_image, CopyrightModel copyright, String end_time, int id, CreatorModel creator) {

		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.description = description;
		this.state = state;
		this.start_time = start_time;
		this.social_links = social_links;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;
		this.timezone = timezone;
		this.email = email;
		this.topic = topic;
		this.background_image = background_image;
		this._copyright = copyright;
		this.end_time = end_time;
		this.id = id;
		this._creator = creator;

	}

}