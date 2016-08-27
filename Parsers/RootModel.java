import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String background_image;
	public String timezone;
	public String organizer_description;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String name;
	public String description;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String type;
	public String privacy;
	public String end_time;
	public String state;
	public String location_name;

	public RootModel(CreatorModel creator, String start_time, Call_for_papersModel call_for_papers, String email, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, String background_image, String timezone, String organizer_description, VersionModel version, String logo, String topic, String name, String description, String organizer_name, String schedule_published_on, CopyrightModel copyright, String type, String privacy, String end_time, String state, String location_name) {

		this._creator = creator;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.name = name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.type = type;
		this.privacy = privacy;
		this.end_time = end_time;
		this.state = state;
		this.location_name = location_name;

	}

}