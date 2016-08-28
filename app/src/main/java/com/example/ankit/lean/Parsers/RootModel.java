import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String description;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public String name;
	public String type;
	public String location_name;
	public CreatorModel _creator;
	public String topic;
	public String timezone;
	public String schedule_published_on;
	public String logo;
	public String background_image;
	public String privacy;
	public String organizer_description;

	public RootModel(String start_time, String organizer_name, VersionModel version, String email, ArrayList<Social_linksModel> social_links, String end_time, Call_for_papersModel call_for_papers, String code_of_conduct, String description, int id, CopyrightModel copyright, String state, String name, String type, String location_name, CreatorModel creator, String topic, String timezone, String schedule_published_on, String logo, String background_image, String privacy, String organizer_description) {

		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.email = email;
		this.social_links = social_links;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this.name = name;
		this.type = type;
		this.location_name = location_name;
		this._creator = creator;
		this.topic = topic;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_description = organizer_description;

	}

}