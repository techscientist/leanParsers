import java.util.ArrayList;

class RootModel {

	public String type;
	public VersionModel _version;
	public String location_name;
	public String topic;
	public String description;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String schedule_published_on;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;
	public String end_time;
	public String email;
	public String start_time;
	public String name;
	public String background_image;
	public String state;
	public String logo;
	public String privacy;

	public RootModel(String type, VersionModel version, String location_name, String topic, String description, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, String schedule_published_on, CreatorModel creator, ArrayList<Social_linksModel> social_links, String organizer_description, String timezone, String organizer_name, String code_of_conduct, String end_time, String email, String start_time, String name, String background_image, String state, String logo, String privacy) {

		this.type = type;
		this._version = version;
		this.location_name = location_name;
		this.topic = topic;
		this.description = description;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.email = email;
		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;

	}

}